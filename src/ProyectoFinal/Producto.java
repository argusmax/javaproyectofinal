package ProyectoFinal;

public class Producto implements Comparable <Producto> {
     
    String Codigo, Descripcion, Precio, Cantidad; 
    
    public Producto(String Codigo, String Descripcion, String Precio, String Cantidad) {
        
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
               
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }
                        
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
           
    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    boolean setCantidad() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int compareTo(Producto o) {
        return Descripcion.compareTo(o.getDescripcion());
    }
                  
}
