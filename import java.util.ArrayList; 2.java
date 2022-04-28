import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Processo {

    private static ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    public static void reservarMesa(){

        boolean tipo;
        String aux = "";
        TipoPessoa tipoPessoa = inputTipoCliente(); 

        String nome = JOptionPane.showInputDialog("Nome: ");

        Cliente c = null;
        switch(tipoPessoa){
            case Fisica:
                String cpf = JOptionPane.showInputDialog("CPF: ");    
                PessoaFisica pf = new PessoaFisica(nome, cpf);
                c = pf;
                break;
            case Juridica:
                String cnpj = JOptionPane.showInputDialog("CNPJ: ");
                PessoaJuridica pj = new PessoaJuridica(nome, cnpj);
                c = pj;
                break;
        }


        while(!aux.equals("s") && !aux.equals("n")){
            aux = JOptionPane.showInputDialog("pagamento será à vista").toLowerCase();
            if(!aux.equals("s") && !aux.equals("n")){
                JOptionPane.showMessageDialog(null, Informe um valor válido\nS: Pagamento à vista | N: Pagamento parcelado");
            }
        }
            
     
            JOptionPane.showMessageDialog(null, "Reservas esgotadas :( \nVocê está na lista de espera");
        } else{
            JOptionPane.showMessageDialog(null, "Reserva efetuada com sucesso");
        }
    } 
    
            if(achou >= 0){
                JOptionPane.showMessageDialog(null, "Você possui uma reserva"); 
            } else{
                JOptionPane.showMessageDialog(null, "Você não possui uma reserva");     
            }
        } else{
            JOptionPane.showMessageDialog(null, "ERRO!! Não existem reservas cadastradas!");     
        } 
    }


         
    }

    public static void imprimirListaDeEspera(){
        if(reservas.size() > 6){
            for(int i = 0; i < reservas.size(); i++) {
                if(i >= 6){
                    JOptionPane.showMessageDialog(null, lista de espera);
                }
            }
        } else{
            JOptionPane.showMessageDialog(null, revervas disponíveis!");     
        }
         
    }

    "Informe seu CPF/CNPJ: ");
            , "Reserva removida com sucesso!"); 
           
         
        } 
    }


  