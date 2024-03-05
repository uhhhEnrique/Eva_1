public class App {
    public static void main(String[] args) throws Exception {
         //TODO code application logic here
         byte PruebaByte; // 1 Byte = 8 bits -> 256 
         //PruebaByte = 256; // 256 no cabe en la variable
         PruebaByte = -127;
         //PruebaByte = 128; //acepta de -128 y 127
         PruebaByte = -128;
         Short PruebaShort;// dos bytes = 16 bits --> 65536
        // PruebaShort = -32769; no cabe -32769
        PruebaShort = -32768;
        PruebaShort = 32767;
        System.out.println(PruebaShort);//imprime la variable prueba
        PruebaShort++; // ++es un operador, suma uno al contenido de la variable 
        System.out.println(PruebaShort);
  }
    }
}
