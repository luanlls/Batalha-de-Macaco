package batalhademacaco;

public class macaco {

    private String nome;
    private String especie;
    private int level;
    private int vida;
    private int ataque;
    private int defesa;

    public macaco(String nome, String especie, int level) {
        this.nome = nome;
        this.especie = especie;
        this.level = level;

        calcularAtributos();
        calcularBonus();
    }

    public String getNome() {
        return this.nome;
    }

    public int getVida() {
        return this.vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getDefesa() {
        return this.defesa;
    }

    private void calcularAtributos() {
        switch (especie) {
            case "Gorila":
                vida = vida + 25;
                ataque = 60;
                defesa = 40;
                break;

            case "Chimpanzé":
                vida = vida + 10;
                ataque = 40;
                defesa = 35;
                break;

            case "Orangotango":
                vida = vida + 5;
                ataque = 30;
                defesa = 60;
                break;

            case "Babuíno":
                vida = vida - 10;
                ataque = 50;
                defesa = 25;
                break;
        }
    }

    private void calcularBonus() {
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
    }

    public void imprimiMacaco() {
        System.out.printf("Nome: %s | Especie: %s | Level: %d | Vida: %d | Ataque: %d | Defesa: %d\n\n", nome, especie, level, vida, ataque, defesa);
    }

}
