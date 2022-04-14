## Configurando um projeto JavaFX 17 no Visual Studio Code

Este tutorial vale para o Visual Studio Code 1.63.0 ou qualquer versão mais recente.

Baixe o [JDK 11 ou outro mais recente](http://jdk.java.net/) no seu sistema operacional. Certifique-se de que a variável de ambiente `JAVA_HOME` está apropriadamente inicializada para o diretório de instalação do JDK. Se ainda não tiver baixado, pode seguir o tutorial que está neste [LINK](https://github.com/Atilio-Luiz/poo_2022_1/blob/master/install/OpenJDK17/README.md).

### Java

Pela primeira vez:

1. Baixe o [JavaFX SDK](https://gluonhq.com/products/javafx/) para o seu sistema operacional e descompacte o arquivo para o local desejado. Anote o caminho completo do local onde essa pasta foi descompactada. Vamos precisar desse caminho logo mais abaixo.

2. Certifique-se de que você tem o [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) instalado no seu Visual Studio Code.

3. Baixe o projeto `hellofx` que está na pasta acima, abra a pasta `hellofx` no Visual Studio Code. Abra qualquer arquivo Java do projeto a fim de importá-lo. 

4. Abra o arquivo `.vscode/settings.json`, substitua o `<JavaFX_lib_path>` pelo caminho completo da pasta `lib` do JavaFX SDK que você baixou na primeira etapa acima.

5. Abra o arquivo `.vscode/launch.json`, substitua o `<JavaFX_lib_path>` pelo caminho completo da pasta `lib` do JavaFX que você baixou na primeira etapa acima.

#### Execute a aplicação JavaFX

Para executar a aplicação JavaFX, abra o painel `Run and Debug` no lado esquerdo -> `Launch App`.