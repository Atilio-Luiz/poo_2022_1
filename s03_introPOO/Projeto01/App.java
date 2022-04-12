public class App {
    public static void main(String[] args) throws Exception {
        DataSimples data = new DataSimples();
        byte dia = 4, mes = 12;
        short ano = 2021;
        data.inicializaDataSimples(dia, mes, ano);
        data.mostraData();
    }
}
