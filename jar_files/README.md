# Criando um arquivo JAR executável no VS Code e pela linha de comando

## 1. O que é a ferramenta JAR do Java?

O **Jar *(Java Archive)*** é uma ferramenta do JDK usada para empacotar um ou mais arquivos *.class* do Java juntamente com metadados associados e outros recursos (texto, imagens, etc.) em um único arquivo a fim de distribuir softwares ou bibliotecas na palataforma Java. O Jar também fornece a facilidade de criar um arquivo com extensão .jar executável que chama o método main da classe principal se você clicar duas vezes no arquivo (no caso de aplicações gráficas).

Um arquivo com a extensão .jar é usado para armazenar programas e jogos Java em um único arquivo. Os arquivos .jar são compactados em ZIP e como eles podem conter centenas ou até milhares de arquivos em formato compactado, é fácil compartilhá-los e movê-los.

Você pode ler a documentação da Oracle sobre o JAR na íntegra aqui nesse link: https://docs.oracle.com/javase/tutorial/deployment/jar/index.html

## 2. Como abrir arquivos com extensão .JAR?

O Java Runtime Environment (JRE) deve estar instalado na sua máquina para abrir arquivos JAR executáveis, mas observe que nem todos os arquivos JAR são executáveis. Depois de instalado, você pode apenas clicar duas vezes no arquivo para abri-lo.

Como os arquivos JAR são compactados com ZIP, qualquer descompactador de arquivo pode abrir um para ver o conteúdo que está dentro. Isso inclui programas como 7-Zip, PeaZip e jZip.

Outra forma de abrir o arquivo é usar o seguinte comando no prompt de comando (terminal), substituindo *yourfile.jar* pelo nome do seu próprio arquivo JAR:

`java -jar yourfile.jar`

## 3. Neste tutorial

Neste tutorial você aprenderá como criar um arquivo .jar executável. Vamos pegar uma aplicação java para console e explorar duas formas de transformá-la em um arquivo .jar: vamos fazer isso usando o VS Code e depois vamos fazer isso usando a linha de comando.

## 4. Visual Studio Code

### 4.1. Baixe a extensão

A fim de criar um arquivo .jar executável da sua aplicação, você deve ter a extensão [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) instalada no seu VS Code.

![](images/img01.png)

### 4.2. Escreva o seu programa Java

Eu vou usar nesse exemplo esse programa [aqui](Cadastro).
É um programa Java para console que cadastra pessoas e mostra as pessoas cadastradas no terminal. Além disso, o programa usa persitência em arquivo texto a fim de manter os dados das pessoas cadastradas salvos em arquivo.

### 4.3 Exportando o arquivo JAR

A seguir, mostramos como empacotar a sua aplicação em um arquivo .jar usando o VS Code.

No canto inferior esquerdo do VS Code vocês encontrará a opção `JAVA PROJECTS`. Ao lado dela, você encontrará um símbolo contendo uma flecha para a direita de nome `EXPORT JAR`. Clique nele.

![](images/img02.png)

Nesse momento, o VS Code te pedirá para especificar a classe principal `MAIN CLASS`.

Nesse exemplo, forneça a classe Principal `App`.

**Nota:** Se você não especificar a classe principal, o arquivo jar não se tornará um arquivo executável.

Pronto! O seu arquivo .jar executável já foi gerado, com o nome **Cadastro.jar**

Um exemplo gerado por mim pode ser baixado [aqui](Cadastro.jar)



