
public class cls_fincas {
    private String str_nombre;
    private String str_codigo;
    private String str_direccion;
    private String str_contacto;
    private String str_propietario;
    
    public cls_fincas (String n, String c, String d,String co, String p){
        this.str_nombre = n; //no se trabaja con los parametros , se trabaja es con los atributos
        this.str_codigo = c;
        this.str_direccion = d;
        this:str_contacto = co;
        this.str_propietario = p;
    }
    //setters
        public void setNombre(String nombre){this.str_nombre = nombre;}  
        public void setDireccion (String direccion){this.str_direccion = direccion;}
        public void setContacto(String contacto){this.str_contacto = contacto;}
        public void setPropietario (String propietario){this.str_propietario = propietario;}
        
        //getters los geeters son retornables
        
        public String  getNombre(){return this.str_nombre;}
        public String getCodigo(){return this.str_codigo;}
        public String getDireccion(){ return this.str_direccion;}
        public String getContacto(){ return this.str_contacto;}
        public String getPropietario(){ return this.str_propietario;}
        
}
