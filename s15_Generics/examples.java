ArrayList files = new ArrayList();
// Você não sabe que tipo de objeto está 
// armazenado dentro da lista
String filename = (String) files.get(0);

ArrayList<String> files = new ArrayList<>();
// Você não precisa mais da operação de cast
String filename = files.get(0);
