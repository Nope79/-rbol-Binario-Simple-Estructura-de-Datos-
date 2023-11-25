package ArbolTarjeta;

import java.util.Random;

/**
 *
 * @author Master79
 */
public class Tarjeta {
    
    private String titular;
    private String numTarjeta;
    private String tipo;
    private double saldo;

    public Tarjeta(String titular, String tipo, double saldo) {
        
        this.titular = titular;
        this.tipo = tipo;
        this.saldo = saldo;
        this.numTarjeta = genNum();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "titular=" + titular + ", numTarjeta=" + numTarjeta + ", tipo=" + tipo + ", saldo=" + saldo + '}';
    }
    
    public String genNum(){
        
        // 10 NÚMEROS ALEATORIOS
        
        String num = "";
        
        Random r = new Random();
        
        int x = r.nextInt(10, 100);
        num += x;
        x = r.nextInt(10, 100);
        num += x;
        x = r.nextInt(10, 100);
        num += x;
        x = r.nextInt(10, 100);
        num += x;
        x = r.nextInt(10, 100);
        num += x;
        
        return num;
    }
}
