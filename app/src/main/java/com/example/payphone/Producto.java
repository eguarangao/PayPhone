package com.example.payphone;

public class Producto
{
        private String info;
        private double valor;
        private double iva;

        public Producto() {
        }

    public Producto(String info, double valor) {
        this.info = info;
        this.valor = valor;
    }

    public Producto(String info, double valor, double iva) {
        this.info = info;
        this.valor = valor;
        this.iva = iva;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }


}
