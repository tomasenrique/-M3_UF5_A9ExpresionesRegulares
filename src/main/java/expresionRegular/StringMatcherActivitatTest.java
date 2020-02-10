/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionRegular;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author pere
 */
public class StringMatcherActivitatTest {
    private static StringMatcherActivitat m;

    public StringMatcherActivitatTest() {
        m = new StringMatcherActivitat();
    }

    @Test
    public void testIsTrue() {
        assertTrue(m.isTrue("true"));
        assertFalse(m.isTrue("true2"));
        assertFalse(m.isTrue("True"));
    }

    @Test
    public void testIsTrueVersion2() {
        assertTrue(m.isTrueVersion2("true"));
        assertFalse(m.isTrueVersion2("true2"));
        assertTrue(m.isTrueVersion2("True"));
    }

    @Test
    public void testIsTrueOrYes() {
        assertTrue(m.isTrueOrYes("true"));
        assertTrue(m.isTrueOrYes("yes"));
        assertTrue(m.isTrueOrYes("Yes"));
        assertFalse(m.isTrueOrYes("no"));
    }

    @Test
    public void testContainsTrue() {
        assertTrue(m.containsTrue("thetruewithin"));
    }

    @Test
    public void testIsThreeLetters() {
        assertTrue(m.isThreeLetters("abc"));
        assertFalse(m.isThreeLetters("abcd"));
    }

    @Test
    public void testisNoNumberAtBeginning() {
        assertTrue(m.isNoNumberAtBeginning("abc"));
        assertFalse(m.isNoNumberAtBeginning("1abcd"));
        assertTrue(m.isNoNumberAtBeginning("a1bcd"));
        assertTrue(m.isNoNumberAtBeginning("asdfdsf"));
    }

    @Test
    public void testHasNot_b() {
        assertTrue(m.hasNot_b("1"));
        assertFalse(m.hasNot_b("abcksdfkdskfsdfdsf"));
        assertTrue(m.hasNot_b("skdskfjsmcnxmvjwque484242"));
    }

    @Test
    public void testLessThenThreeHundret() {
        assertTrue(m.isLessThenThreeHundret("288"));
        assertFalse(m.isLessThenThreeHundret("3288"));
        assertFalse(m.isLessThenThreeHundret("328 8"));
        assertTrue(m.isLessThenThreeHundret("1"));
        assertTrue(m.isLessThenThreeHundret("99"));
        assertFalse(m.isLessThenThreeHundret("300"));
    }


    //    @Test
//    public void testIsNoNumberAtBeginning() {
//        System.out.println("isNoNumberAtBeginning");
//        String s = "";
//        StringMatcherActivitat instance = new StringMatcherActivitat();
//        boolean expResult = false;
//        boolean result = instance.isNoNumberAtBeginning(s);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testPassword() {
//        System.out.println("password");
//        String s = "";
//        StringMatcherActivitat instance = new StringMatcherActivitat();
//        boolean expResult = false;
//        boolean result = instance.password(s);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testJimOJoe() {
//        System.out.println("jimOJoe");
//        String s = "";
//        StringMatcherActivitat instance = new StringMatcherActivitat();
//        boolean expResult = false;
//        boolean result = instance.jimOJoe(s);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testConteNumeros() {
//        System.out.println("conteNumeros");
//        String s = "";
//        StringMatcherActivitat instance = new StringMatcherActivitat();
//        boolean expResult = false;
//        boolean result = instance.conteNumeros(s);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }


    //==================================================================================================================
    //==================================================================================================================

    /**
     * Ejercicios hechos sobre expresiones regulares - A9
     */

    // 1. Buscar una cadena binaria que comience con 111
    @Test
    public void testBinariComença_111() {
        // Mensaje de error si no coincide el patron
        String mensaje = "La cadena binaria debe comenzar con 111";
        assertTrue(mensaje, m.binariComença_111("11100111"));
        assertFalse(mensaje, m.binariComença_111("0000111"));
        assertFalse(mensaje, m.binariComença_111("1100111"));
        assertFalse(mensaje, m.binariComença_111("11"));
    }

    // 2. Determinar si una cadena que termine en 'at'
    @Test
    public void testCadenaAcaba_at() {
        String mensaje = "La cadena ingresada debe terminar en 'at'";
        assertTrue(mensaje, m.cadenaAcaba_at("cadenaAcabat"));
        assertFalse(mensaje, m.cadenaAcaba_at("cadenaAcaba_at"));
        assertFalse(mensaje, m.cadenaAcaba_at("cadenaAcabaAT"));
    }

    /**
     * 3. Buscar las palabras que empiecen en una determinada letra, terminen en una
     * determinada letra y tengan una determinada longitud. Letra inicial, letra final
     * y longitud son variables del ejercicio.
     */
    @Test
    public void testComençaAcabaIMida() {
        // Palabras
        String s1 = "abacalero"; //
        String s2 = "aBaCaLeRo"; //
        String s3 = "aDrTfGz"; //
        String s4 = "vbacero"; //
        // Datos para crear el patron
        char lletraInicial = 'a';
        char lletraFinal = 'o';
        int longitud = 7;
        assertTrue(m.començaAcabaIMida(s1, lletraInicial, lletraFinal, longitud));
        assertTrue(m.començaAcabaIMida(s2, lletraInicial, lletraFinal, longitud));
        assertFalse(m.començaAcabaIMida(s3, lletraInicial, lletraFinal, longitud));
        assertFalse(m.començaAcabaIMida(s4, lletraInicial, lletraFinal, longitud));
    }

    // FALTA
    // 4. Buscar palabras que contengan los  trígrafos  "ENT" o "EST", en mayusculas o minusculas.
//    @Test
//    public void testConte_ENT_o_EST() {
//        System.out.println("conte_ENT_o_EST");
//        String s = "";
//        StringMatcherActivitat instance = new StringMatcherActivitat();
//        boolean expResult = false;
//        boolean result = instance.conte_ENT_o_EST(s);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }

    //5. Buscar si una cadena contiene . i @
    @Test
    public void testConte_punt_i_arroba() {
        System.out.println("conte_punt_i_arroba");
        String s1 = "ahd.i@";
        String s2 = "ahd";
        assertTrue(m.conte_punt_i_arroba(s1));
        assertFalse(m.conte_punt_i_arroba(s2));
    }

    //6. Determina si una cadena contiene numeros
    @Test
    public void testConteTresNumeros() {
        System.out.println("conteTresNumeros");
        String s1 = "wdwe234dwedew";
        String s2 = "wdwedwedew";
        assertTrue(m.conteTresNumeros(s1));
        assertFalse(m.conteTresNumeros(s2));
    }

    //7. Determinar si una cadena solo contiene numeros
    @Test
    public void testNomesConteNumeros() {
        System.out.println("nomesConteNumeros");
        String s1 = "123456";
        String s2 = "1234fefredf56";
        assertTrue(m.nomesConteNumeros(s1));
        assertFalse(m.nomesConteNumeros(s2));
    }


    //8. Controlar si una cadena tiene longitud manima 3 y maxima 6.
    @Test
    public void testTeLongitudEntre3I6() {
        System.out.println("teLongitudEntre3I6");
        String s1 = "qwsdrg";
        String s2 = "qw";
        String s3 = "qwfghujhyg";
        assertTrue(m.teLongitudEntre3I6(s1));
        assertFalse(m.teLongitudEntre3I6(s2));
        assertFalse(m.teLongitudEntre3I6(s3));
    }


    // 13. Buscar nombres de ficheros que sean imagenes .jpg o .png
    @Test
    public void testBuscarFicheros(){
        System.out.println("Buscar archivos jpg y png");
        String s1 = "hola.jpg";
        String s2 = "queTal.png";
        String s3 = "hola.gif";
        assertTrue(m.buscarFicheros(s1));
        assertTrue(m.buscarFicheros(s2));
        assertFalse(m.buscarFicheros(s3));
    }

    // 14.	Buscar nombres de archivos .txt que empiecen con la letra a
    @Test
    public void testBuscarTXTconA(){
        System.out.println("Buscar archivos de texto que inicien con 'a'");
        String s1 = "ahola.txt";
        String s2 = "queTal.txt";
        String s3 = "ahola.gif";
        assertTrue(m.buscarFicherosTXTcon(s1));
        assertFalse(m.buscarFicherosTXTcon(s2));
        assertFalse(m.buscarFicherosTXTcon(s3));
    }


    //==================================================================================================================
    //==================================================================================================================


//

//

//
//    @Test
//    public void testEsISBN() {
//        System.out.println("esISBN");
//        String s = "";
//        StringMatcherActivitat instance = new StringMatcherActivitat();
//        boolean expResult = false;
//        boolean result = instance.esISBN(s);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testPuntsPlaEntre1i5() {
//        System.out.println("puntsPlaEntre1i5");
//        String s = "";
//        StringMatcherActivitat instance = new StringMatcherActivitat();
//        boolean expResult = false;
//        boolean result = instance.puntsPlaEntre1i5(s);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }

}
