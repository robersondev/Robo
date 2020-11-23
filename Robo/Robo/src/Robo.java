public class Robo {
    final String nome;
    final float peso;
    final float velocidadeMax = 5;
    final float pesoCargaMax = 20;
    final String tipoTracao = "esteira";
    float posicaoX;
    float posicaoY;
    
    public Robo() {
       	
    }
    
    public Robo(String nome, float peso) {
    }
    
    public Robo(String nome, float peso, float posX, float posY) {
    }
    
    
    public void move(float x, float y){
        posicaoX = x;
        posicaoY = y;
    }
    
    public void move(float pos) {
    	
    }
    

       
        
}