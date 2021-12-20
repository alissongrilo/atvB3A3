class Veiculo{
    String marca;
    int qtdRodas;
    String Modelo;
    int velocidade = 0;

    public Veiculo(String _marca, int _quantidade, String _modelo, int _velocidade){
        this.marca = _marca;
        this.qtdRodas = _quantidade;
        this.Modelo = _modelo;
        this.velocidade = _velocidade;
    }

    public void imprimirInformacoes(){
        System.out.printf("Marca:",marca,"\n");
        System.out.printf("Quantidade de rodas:",qtdRodas,"\n");
        System.out.printf("Modelo:",Modelo,"\n");
        System.out.printf("Velocidade:",velocidade,"\n");
    }

    public int acelerar(int num){
        return this.velocidade + num;
    }

    public int frear(int num){
        return this.velocidade - num;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return Modelo;
    }

    public int getRodas(){
        return qtdRodas;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public String setMarca(String marca){
        return this.marca = marca;
    }

    public String setModelo(String Modelo){
        return this.Modelo = Modelo;
    }

    public int setRodas(int quantidade){
        return this.qtdRodas = quantidade;
    }

    public int setVelocidade(int velocidade){
        return this.velocidade = velocidade;
    }

}


class Bicicleta extends Veiculo{
    int numMarchas;
    boolean bagageiro;
    public Bicicleta(String _marca, int _quantidade, String _modelo, int _velocidade, int _numMarchas,boolean _bagageiro) {
        super(_marca, _quantidade, _modelo, _velocidade);
        this.numMarchas = _numMarchas;
        this.bagageiro = _bagageiro;
    }

    public void imprimirInformacoes(){
        System.out.println("Marca");
        System.out.printf(this.marca);
        System.out.println("Rodas");
        System.out.print(this.qtdRodas);
        System.out.println("Modelo");
        System.out.printf(this.Modelo);
        System.out.println("Velocidade");
        System.out.print(this.velocidade);
        System.out.println("Marchas");
        System.out.print(this.numMarchas);
        if(bagageiro){
            System.out.printf("|Bagageiro: sim\n");
        }else{
            System.out.printf("|Bagageiro: nao\n");
        }
    }

    public int setMarchas(int marchas){
        return this.numMarchas = marchas;
    }
    public boolean setBagageiro(Boolean bagageiro){
        return this.bagageiro = bagageiro;
    }
    public int getMarchas(){
        return numMarchas;
    }
    public boolean getBagageiro(){
        return bagageiro;
    }
}

class Automovel extends Veiculo{
    static double potenciaDoMotor;
    public Automovel(String _marca, int _quantidade, String _modelo, int _velocidade,double _potenciaDoMotor) {
        super(_marca, _quantidade, _modelo, _velocidade);
        this.potenciaDoMotor = _potenciaDoMotor;
    }
    public void imprimirInformacoes(){
        System.out.printf("Marca:",this.marca,"\n");
        System.out.printf("Quantidade de rodas:",this.qtdRodas,"\n");
        System.out.printf("Modelo:",this.Modelo,"\n");
        System.out.printf("Velocidade:",this.velocidade,"\n");
        System.out.printf("Potencia:",this.potenciaDoMotor,"\n");
    }
    public double setPotencia(double potencia){
        return this.potenciaDoMotor = potencia;
    }
    public double getPotencia(double potencia){
        return potenciaDoMotor;
    }
} 
class Moto extends Automovel{
    boolean partidaEletrica;
    public Moto(String _marca, int _quantidade, String _modelo, int _velocidade,boolean _partidaEletrica){
        super(_marca, _quantidade, _modelo, _velocidade, potenciaDoMotor);
        this.partidaEletrica = _partidaEletrica;
    }
    public void imprimirInformacoes(){
        System.out.println("Marca");
        System.out.printf(this.marca);
        System.out.println("Rodas");
        System.out.print(this.qtdRodas);
        System.out.println("Modelo");
        System.out.printf(this.Modelo);
        System.out.println("Velocidade");
        System.out.print(this.velocidade);
        if(partidaEletrica){
            System.out.printf("|Partida Eletrica: sim\n");
        }else{
            System.out.printf("|Partida Eletrica: nao\n");
        }
    }
    public boolean getPartida(){
        return partidaEletrica;
    }
    public boolean setPartida( boolean partida){
        return this.partidaEletrica = partida;
    }
}
class Carro extends Automovel{
    int qtdPortas;
    public Carro(String _marca, int _quantidade, String _modelo, int _velocidade,int _qtdPortas) {
        super(_marca, _quantidade, _modelo, _velocidade, potenciaDoMotor);
        this.qtdPortas = _qtdPortas;
    }
    public void imprimirInformacoes(){
        System.out.println("|Marca:");System.out.println(this.marca);
        System.out.println("|Rodas:");System.out.print(this.qtdRodas);
        System.out.println("|Modelo:");System.out.printf(this.Modelo);
        System.out.println("|Velocidade:");System.out.print(this.velocidade);
        System.out.println("|Portas:");System.out.print(this.qtdPortas);
    }
    public int getPortas(){
        return qtdPortas;
    }
    public int setPortas(int numero){
        return this.qtdPortas = numero;
    }
}

public class Questao2 {
    public static void main(String args[]) throws IOException {
        FileInputStream arquivo = new FileInputStream("/home/alisson/java/atvB3A3/texto.txt");
        InputStreamReader ainput = new InputStreamReader(arquivo);
        BufferedReader b = new BufferedReader(ainput);

        String _marca= b.readLine();
        String _quantidade=b.readLine();
        String _modelo=b.readLine();
        String _velocidade=b.readLine();
        String _qtdPortas=b.readLine();

        int q = Integer.parseInt(_quantidade);
        int v= Integer.parseInt(_velocidade);
        int p = Integer.parseInt(_qtdPortas);

        Carro carro = new Carro(_marca, q, _modelo, v, p);
        String marca= b.readLine();
        String quantidade=b.readLine();
        String modelo=b.readLine();
        String velocidade=b.readLine();
        String part=b.readLine();

        int quant = Integer.parseInt(quantidade);
        int velo= Integer.parseInt(velocidade);

        Boolean partida = Boolean.parseBoolean(part);
        Moto moto = new Moto(marca, quant, modelo, velo, partida);
        String m= b.readLine();
        String qu =b.readLine();
        String mu=b.readLine();
        String vel=b.readLine();
        String marchas=b.readLine();
        String bagageirp=b.readLine();

        int mar = Integer.parseInt(marchas);
        int qants = Integer.parseInt(qu);
        int ve= Integer.parseInt(vel);

        Boolean bagageiro = Boolean.parseBoolean(bagageirp);
        Bicicleta bicicleta = new Bicicleta(m, qants, mu, ve, mar, bagageiro);
        
        carro.imprimirInformacoes();
        moto.imprimirInformacoes();
        bicicleta.imprimirInformacoes();
    }
}