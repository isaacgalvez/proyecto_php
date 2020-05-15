package ejercicio2;


public class factura {
    
private long n_cuenta ;
  private int  lectura_actual_del_medidor;
  private int lectura_anterior_del_medidor;
  private int multiplicador;
  private int dias_facturados;
  private int consumo_mensual;
  private int consumo_diario;
  private int consumo;
  private int valor_factura;

    public long getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(long n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public int getLectura_actual_del_medidor() {
        return lectura_actual_del_medidor;
    }

    public void setLectura_actual_del_medidor(int lectura_actual_del_medidor) {
        this.lectura_actual_del_medidor = lectura_actual_del_medidor;
    }

    public int getLectura_anterior_del_medidor() {
        return lectura_anterior_del_medidor;
    }

    public void setLectura_anterior_del_medidor(int lectura_anterior_del_medidor) {
        this.lectura_anterior_del_medidor = lectura_anterior_del_medidor;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getDias_facturados() {
        return dias_facturados;
    }

    public void setDias_facturados(int dias_facturados) {
        this.dias_facturados = dias_facturados;
    }

    public int getConsumo_mensual() {
        return consumo_mensual;
    }

    public void setConsumo_mensual(int consumo_mensual) {
        this.consumo_mensual = consumo_mensual;
    }

    public int getConsumo_diario() {
        return consumo_diario;
    }

    public void setConsumo_diario(int consumo_diario) {
        this.consumo_diario = consumo_diario;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo() {
        this.consumo = (this.lectura_actual_del_medidor- this.lectura_anterior_del_medidor);
    }

    public int getValor_factura() {
        return valor_factura;
    }

    public void setValor_factura() {
        this.valor_factura = this.consumo;
    }
  
  
    
  
}
