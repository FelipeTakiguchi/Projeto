import javafx.collections.ObservableList;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ObservableList<Jogador> jogadores;
        ObservableList<Pergunta> perguntas;

        boolean cadastrarJogador(){

        }
        void carregarPerguntas(){
            String arq = null;
            File f = new File(arq);

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String linha="";

            do{
                linha = br.readLine();
                if(linha != null){
                    String[] tokens = linha.split("X");
                    //System.out.println(tokens[0]+" "+tokens[1]);
                    String[] parte1 = tokens[0].split(" ");
                    String[] parte2 = tokens[1].split(" ");

                    String nomeTime1 = parte1[0];
                    int gols1 = Integer.valueOf(parte1[1]);

                    String nomeTime2 = parte2[1];
                    int gols2 = Integer.valueOf(parte2[0]);

                    //System.out.println(nomeTime1+" "+gols1+" "+nomeTime2+" "+gols2);

                    Pergunta time1=buscar(nomeTime1);

                    if(time1==null){
                        time1 = new Time(nomeTime1);
                        times.add(time1);
                    }

                    Time time2=buscar(nomeTime2);
                    if(time2==null){
                        time2= new Time(nomeTime2);
                        times.add(time2);
                    }

                    time1.registraJogo(gols1,gols2);
                    time2.registraJogo(gols2,gols1);

                }
            }while(linha != null);

            br.close();
            fr.close();
        }
        void salvarDados(){
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(/tmp/Test1/src /ExemploPerguntas));
            String linha = "";
            buffWrite.append(linha + "\n");
            buffWrite.close();
        }
        void carregarDados(){

        }
    }
}