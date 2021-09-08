public class Lista {
	private No inicio;
	private No fim;

	public Lista() {
		inicio = null;
	}

	public void inserirFinal(int valor) {
		No novo = new No();
		novo.setValor(valor);
		if(inicio == null) {
			inicio = novo;
		}
		else {
			No tmp = inicio;
			while(tmp.getProx() != null) {
				tmp = tmp.getProx();
			}
			tmp.setProx(novo);
			novo.setAnt(tmp);
		}
	}

	No getInicio() {
		return inicio;
	}

	void setInicio(No inicio) {
		this.inicio = inicio;
	}

	No getFim() {
		return fim;
	}

	void setFim(No fim) {
		this.fim = fim;
	}

	public void inserirFinalRec(int valor) {
		if(inicio == null) {
			No novo = new No();
			inicio = novo;
			inicio.setValor(valor);
		}
		else {
			inserirFinalRec(inicio, valor);
		}
	}

	private void inserirFinalRec(No tmp, int valor) {
		if(tmp.getProx()!= null) {
			inserirFinalRec(tmp.getProx(), valor);
		}
		else {
			No novo = new No();
			novo.setValor(valor);
			tmp.setProx(novo);
			novo.setAnt(tmp);
		}
	}

	public void inserirInicio(int valor) {
		No novo = new No();
		novo.setValor(valor);
		if(inicio == null) {
			inicio = novo;
		}
		else {
			novo.setProx(inicio);
			inicio.setAnt(novo);
			inicio = novo;
		}
	}

	public boolean isEmpty() {
		if(inicio == null) return true;
		else               return false;
	}

	public int removerFinal() {
		if(inicio.getProx() == null) {
			int valor = inicio.getValor();
			inicio = null;
			return valor;
		}
		else {
			No tmp = inicio;
			while(tmp.getProx() != null) {
				tmp = tmp.getProx();
			}
			tmp.getAnt().setProx(null);
			tmp.setAnt(null);
			int valor = tmp.getValor();
			tmp = null;
			return valor;
		}
	}

	public void imprimir() {
		if(inicio == null) { System.out.println("Lista Vazia"); }
		else {
			No tmp = inicio;
			while(tmp != null) {
				System.out.print("" + tmp.getValor() + "->");
				tmp = tmp.getProx();
			}
			System.out.println("");
		}
	}

	public int removerInicio() {
		if(inicio.getProx() == null) {
			int valor = inicio.getValor();
			inicio = null;
			return valor;
		}
		else {
			No prox = inicio.getProx();
			prox.setAnt(null);
			inicio.setProx(null);
			int valor = inicio.getValor();
			inicio = prox;
			return valor;
		}
	}

	public boolean encontrarElemento(int valor) {
		if(inicio == null) return false;
		else {
			No tmp = inicio;
			while(tmp != null) {
				if(tmp.getValor() == valor) return true;
				tmp = tmp.getProx();
			}
			return false;
		} // fim else
	} // fim metodo encontrarElemento()

	public boolean encontrarElementoRec(No tmp, int valor) {
		if(tmp.getValor() == valor) { 
			return true;
		}
		if(tmp.getProx() != null) {
			return encontrarElementoRec(tmp.getProx(), valor);
		}
		return false;
	}

	private No encontrarElementoPrivado(int valor){
		if(inicio == null) return null;
		else {
			No tmp = inicio;
			while(tmp != null) {
				if(tmp.getValor() == valor) return tmp;
				tmp = tmp.getProx();
			}
			return null;
		} // fim else
	}

	public boolean removerElementoRec(No tmp,int valor) {
		if(tmp.getValor() == valor) return true;
		if(tmp.getProx() != null) removerElementoRec(tmp.getProx(), valor);
		return false;

	}

	public boolean removerElemento(int valor) {
		No tmp = encontrarElementoPrivado(valor);
		if(tmp == null) return false;
		else {
			if(tmp == inicio) {
				removerInicio();
				return true;
			}
			else if(tmp.getProx() == null){
				removerFinal();
				return true;
			}
			else {
				/*
           No ant  = tmp.getAnt();
           No prox = tmp.getProx();
           ant.setProx(prox);
           prox.setAnt(ant);
           tmp.setAnt(null);
           tmp.setProx(null);
           tmp = null;
           return true;
				 */
				tmp.getProx().setAnt(tmp.getAnt());
				tmp.getAnt().setProx(tmp.getProx());
				tmp.setAnt(null);
				tmp.setProx(null);
				return true;
			}

		} // fim else 
	}


	/*
  public boolean encontrarElemento(int valor) {
    if(inicio == null) return false;
    else {
      No tmp = inicio;
      while(tmp.getProx() != null) {
          if(tmp.getValor() == valor) return true;
          tmp = tmp.getProx();
      }
      if(tmp.getValor() == valor) return true;
      else                        return false;
    } // fim else
  } // fim metodo encontrarElemento()
	 */
}
