package ejercicio1Fechas;

public class DateUtils {


    public String obtenerFecha(int day, String month, int year) {
        String msg = "";
        boolean dayInc = false;
        boolean monthInc = false;
        boolean yearInc = false;

        if (day < 1 || day > 31) {
            msg = "dia incorrecto";
            dayInc = true;
        }
        if (!month.contentEquals("enero") && !month.contentEquals("febrero") && !month.contentEquals("marzo") &&
                !month.contentEquals("abril") && !month.contentEquals("mayo") && !month.contentEquals("junio") &&
                !month.contentEquals("julio") && !month.contentEquals("agosto") && !month.contentEquals("septiembre") &&
                !month.contentEquals("octubre") && !month.contentEquals("noviembre") && !month.contentEquals("diciembre")) {
            msg = "mes incorrecto";
            monthInc = true;
        }
        if (year < 0 || year > 3000) {
            msg = "gestion incorrecta";
            yearInc = true;
        }

        if(!dayInc && !monthInc && !yearInc){
            if (day >= 1 && day <= 30) {
                day++;
                msg = day + " " + month + " " + year;
            } else if (day == 31) {
                int dayA = 1;
                String monthA = "";
                if (month.contentEquals("enero")) {
                    monthA = "febrero";
                } else if (month.contentEquals("febrero")) {
                    monthA = "marzo";
                } else if (month.contentEquals("marzo")) {
                    monthA = "abril";
                } else if (month.contentEquals("abril")) {
                    monthA = "mayo";
                } else if (month.contentEquals("mayo")) {
                    monthA = "junio";
                } else if (month.contentEquals("junio")) {
                    monthA = "julio";
                } else if (month.contentEquals("julio")) {
                    monthA = "agosto";
                } else if (month.contentEquals("agosto")) {
                    monthA = "septiembre";
                } else if (month.contentEquals("septiembre")) {
                    monthA = "octubre";
                } else if (month.contentEquals("octubre")) {
                    monthA = "noviembre";
                } else if (month.contentEquals("noviembre")) {
                    monthA = "diciembre";
                } else if (month.contentEquals("diciembre")) {
                    monthA = "enero";
                }
                msg = dayA + " " + monthA + " " + year;
            }
        }

        if((dayInc && monthInc)||(dayInc && yearInc) || (monthInc && yearInc)){
            return "ingresar nuevos datos";
        }else {
            return msg;
        }

    }
}