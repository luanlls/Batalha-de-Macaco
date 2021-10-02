package batalhademacaco;

public class BatalhaDeMacaco {

    public static void main(String[] args) {
        
        macaco macaco1 = new macaco("Jonas", "Orangotango", 60);
        macaco macaco2 = new macaco("Felipe", "Gorila", 55);
        
        batalha batalha1 = new batalha();
        
        System.out.println("Macaco 1: ");
        macaco1.imprimiMacaco();
        System.out.println("Macaco 2: ");
        macaco2.imprimiMacaco();
        
        batalha1.macaco1(macaco1.getNome(),macaco1.getVida());
        batalha1.macaco2(macaco2.getNome(),macaco2.getVida());
        
        batalha1.startBatalha();
        
    }   
}
