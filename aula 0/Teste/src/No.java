public class No {
    private No ant;
    private No prox;
    private int valor;
    
    public No() {
      ant = null;
      prox = null;
      valor = 0;  
    }
    public No(int valor) {
        this.ant = null;
        this.prox = null;
        this.valor = valor;
    }
    
    public No(No ant, No prox, int valor) {
        this.ant = ant;
        this.prox = prox;
        this.valor = valor;
    }
    
    public void setAnt(No ant)      { this.ant   = ant;   }
    public void setProx(No prox)    { this.prox  = prox;  }
    public void setValor(int valor) { this.valor = valor; }
    
    public No  getAnt()   { return this.ant;  } 
    public No  getProx()  { return this.prox; }
    public int getValor() { return this.valor;}
    /*
    @Override
    public String toString() {
        String saida = "" + valor;
        return saida;
    }
    */
}
