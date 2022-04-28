public class Reserva implements Pagamento{

    private Cliente cliente;
    private boolean pagamentoAVista;

    public Reserva(Cliente cliente, boolean pagamentoAVista){
        this.cliente = cliente;
        this.pagamentoAVista = pagamentoAVista;
    }
    
    @Override
    public String toString() {
        
        String aux = "";
        
        if(cliente instanceof PessoaFisica){
            aux += "Pessoa Física";
        } else{
            aux += "Pessoa Jurídica"; 
        }

        aux += "Cliente: " + cliente.getNome(); 

        if(getpagamentoAVista() == true){
            aux += "Pagamento: À vista";
        } else{
            aux += "Pagamento: Parcelado";
        }

        return aux;
    }

    @Override
    public double calcularPagamento(){
        
        double valor = 3200.00;

        if(pagamentoAVista == true){
            return valor * 0.9;
        } else{
            return valor;
        }
    }

    public boolean getpagamentoAVista() {
        return this.pagamentoAVista;
    }

    public void setPagamentoAVista(boolean pagamentoAVista) {
        this.pagamentoAVista = pagamentoAVista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}