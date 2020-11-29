import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager {

    private String idioma;
    private String etiqueta;
    private HashMap<String, ResourceBundle> data;

    private static I18NManager miI18NManager;

    public  static I18NManager getInstance(){

        if (miI18NManager == null) {

            miI18NManager= new I18NManager();
        }
        return miI18NManager;
    }

    private I18NManager (){
        this.data = new HashMap<String, ResourceBundle>();

    }

    public String getEtiqueta(String idioma,String etiqueta){
        ResourceBundle rs = data.get(idioma);

        if (rs == null) {
            rs = ResourceBundle.getBundle(idioma);
            data.put(idioma, rs);
        }

        return rs.getString(etiqueta);
    }
}
