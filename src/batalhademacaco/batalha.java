package batalhademacaco;

public class batalha {
    
    private int macaco1Vida;
    private int macaco2Vida;
    private String macaco1Nome;
    private String macaco2Nome;
    
    public void macaco1(String nome, int vida) {
        this.macaco1Nome = nome;
        this.macaco1Vida = vida;
    }
    
    public void macaco2(String nome, int vida) {
        this.macaco2Nome = nome;
        this.macaco2Vida = vida;
    }
    
    public void startBatalha () {
        System.out.printf("Se preparem para a jogação de cocô, pois a batalha mundial de símios vai começar\n\n\n");
        
        if (macaco1Vida > macaco2Vida) {
            System.out.printf("O macaco vencedor é o %s\n", macaco1Nome);
            
        } else if (macaco1Vida < macaco2Vida) {
            System.out.printf("O macaco vencedor é o %s\n", macaco2Nome);
            
        } else {
            System.out.printf("O %s e o %s empataram\n", macaco1Nome, macaco2Nome);
        }
    }
    
}
