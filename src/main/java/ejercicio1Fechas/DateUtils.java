package ejercicio1Fechas;

public class DateUtils {
    public String obtenerFecha(int day, String month, int year){
        String msg = "";
        if (day<1 || day>31){
            msg = "dia incorrecto";
        } else if(month!="enero"&month!="febrero"&month!="marzo"&month!="abril"&month!="mayo"&month!="junio"&month!="julio"&
                month!="agosto"&month!="septiembre"&month!="octubre"&month!="noviembre"&month!="diciembre"){
            msg = "mes incorrecto";
        }else{
            if (day >=1 && day <= 30){
                day++;
                msg= day +" "+ month +" "+ year;
            } else if (day==31) {
                int dayA = 1;
                String monthA = "";
                if (month == "enero") {
                    monthA = "febrero";
                } else if (month == "febrero") {
                    monthA = "marzo";
                } else if (month == "marzo") {
                    monthA = "abril";
                } else if (month == "abril") {
                    monthA = "mayo";
                } else if (month == "mayo") {
                    monthA = "junio";
                } else if (month == "junio") {
                    monthA = "julio";
                } else if (month == "julio") {
                    monthA = "agosto";
                } else if (month == "agosto") {
                    monthA = "septiembre";
                } else if (month == "septiembre") {
                    monthA = "octubre";
                } else if (month == "octubre") {
                    monthA = "noviembre";
                } else if (month == "noviembre") {
                    monthA = "diciembre";
                } else if (month == "diciembre") {
                    monthA = "enero";
                }
                msg = dayA + " " + monthA + " " + year;
            }
        }
        return msg;
    }
}
