package expresionRegular;

//MODEL 1 String match: return s.matches("regex");
//MODEL 2: Pattern/Matcher Buscar, mostrant resultats per consola
//MODEL 3: Pattern/Matcher Buscar si hi ha algun

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcherActivitat {
    // Returns true if the string matches exactly "true"

    //MODEL 1 return s.matches("regex");
    public boolean isTrue(String s) {
        return s.matches("^true$");
    }
    // Returns true if the string matches exactly "true" or "True"

    public boolean isTrueVersion2(String s) {
        return s.matches("[tT]rue");
    }

    // Returns true if the string matches exactly "true" or "True"
    // or "yes" or "Yes"
    public boolean isTrueOrYes(String s) {
        return s.matches("[tT]rue|[yY]es");
    }

    // Returns true if the string contains exactly "true"
    public boolean containsTrue(String s) {
        return s.matches(".*true.*");
    }

    // Returns true if the string contains of three letters
    public boolean isThreeLetters(String s) {
        return s.matches("[a-zA-Z]{3}");
        // Simpler from for
//		return s.matches("[a-Z][a-Z][a-Z]");
    }

    // Returns true if the string does not have a number at the beginning
    public boolean isNoNumberAtBeginning(String s) {
        return s.matches("^[^\\d].*");
    }
    // Returns true if the string contains a arbitrary number of characters except b

    public boolean hasNot_b(String s) {
        return s.matches("([\\w&&[^b]])*");
    }
    // Returns true if the string contains a number less then 300

    public boolean isLessThenThreeHundret(String s) {
        return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
    }

    public boolean password(String s) {
        return s.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
    }


    //MODEL 2: Pattern/Matcher mostrant resultats per consola
    public boolean jimOJoe(String s) {
        Pattern pattern = Pattern.compile("(?i)(Joe|jim)");
        Matcher matcher = pattern.matcher(s);
        boolean resultat = false;
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
            resultat = true;
        }
        return resultat;
        //return s.matches("(?i).*(jim|joe).*");
    }

    //MODEL 3: Pattern/Matcher troba si n'hi ha algun
    public boolean conteNumeros(String s) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }


    //TODO

    //==================================================================================================================
    //==================================================================================================================

    /**
     * Ejercicios hechos sobre expresiones regulares - A9
     */

    // 1. Buscar una cadena binaria que comience con 111
    public boolean binariComença_111(String s) {
        String patron = "^111[01]*"; // Esto es el patron de busqueda en cadena
        Pattern pattern = Pattern.compile(patron); // Codifica la cadena en un patron
        Matcher matcher = pattern.matcher(s); // Se ingresa el texto en donde se aplica el patron
        return matcher.find(); // Se realiza una busqueda y devolvera true o false segun el patron
    }

    // 2. Determinar si una cadena que termine en 'at'
    public boolean cadenaAcaba_at(String s) {
        String patron = "[a-z]at";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    /**
     * 3. Buscar las palabras que empiecen en una determinada letra, terminen en una
     * determinada letra y tengan una determinada longitud. Letra inicial, letra final
     * y longitud son variables del ejercicio.
     */
    public boolean començaAcabaIMida(String s, char lletraInicial, char lletraFinal, int longitud) {
        /**Patron usado ==>> "^a[a-zA-Z]{5}t"
         * donde la primera '^a' sera la letra inicial
         * Esto indicara que pueden ser letras minusculas o mayusculas desde 'a' a 'z' [a-zA-Z]
         * Aqui se indicara la longitud de letras que contien la palabra mas la letyra de inicio y fin {5}
         * y 't' sera la letra final          */
        String patron = "^" + lletraInicial + "[a-zA-Z]{" + longitud + "}" + lletraFinal;
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    // 4. Buscar palabras que contengan los  trígrafos  "ENT" o "EST", en mayusculas o minusculas.
    public boolean conte_ENT_o_EST(String s) { // FALTA
        return false;
    }

    //5. Buscar si una cadena contiene . i @
    public boolean conte_punt_i_arroba(String s) {
        String patron = "[.i@]";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }


    //6. Determina si una cadena contiene numeros
    public boolean conteTresNumeros(String s) {
        String patron = "[0-9]";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    //7. Determinar si una cadena solo contiene numeros
    public boolean nomesConteNumeros(String s) {
        String patron = "^[0-9]+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    //8. Controlar si una cadena tiene longitud manima 3 y maxima 6.
    public boolean teLongitudEntre3I6(String s) {
        String patron = "^([aA-zZ]){3,6}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }



    // 13. Buscar nombres de ficheros que sean imagenes .jpg o .png
    public boolean buscarFicheros(String s) {
        String patron = "(\\.jpg$|\\.png$)";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }


    // 14.	Buscar nombres de archivos .txt que empiecen con la letra a
    public boolean buscarFicherosTXTcon(String s) {
        String patron = "^a[a-z]*(\\.txt$)";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }





    //Determinar si la forma d’un ISBN és vàlida. Ha de tenir 2 dígits, 
    //un guió, 3 dígits, un guió, 4 dígits, un guió i un últim dígit numèric 
    //o X majúscula. Feu el mateix control, suposant que els guions poden 
    //ser opcionals. 

    public boolean esISBN(String s) {
        return false;
    }

    // Determinar si uns punts del pla tenen la forma (x,y), on x i y 
    //estan entre 1 i 5.

    public boolean puntsPlaEntre1i5(String s) {
        return false;
    }

}
