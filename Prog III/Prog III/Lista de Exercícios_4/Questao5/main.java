
 BufferedReader in = null;
   
 try {
  in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
   //lê do arquivo
 } catch (IOException ex) {
   System.err.println("Caught IOException: " + ex.getMessage());
 } finally {
   if (in != null) {
      in.close(); //pode lançar uma exceção
   }
 }
