public class Byte {
    //1.Recupere o primeiro, segundo e terceiro byte do inteiro 235937. Use operadores lógicos bit a bit e operadores de deslocamento para resolver o exercício. Para conferência 235937 = 111001100110100001.
        public static void main(String[] args) {
        int num = 235937;
        int primeiroByte = num >> 24;
        int segundoByte = (num >> 16) & 0xFF;
        int terceiroByte = (num >> 8) & 0xFF;
        System.out.println("Primeiro byte: " + primeiroByte);
        System.out.println("Segundo byte: " + segundoByte);
        System.out.println("Terceiro byte: " + terceiroByte);
    }
}
