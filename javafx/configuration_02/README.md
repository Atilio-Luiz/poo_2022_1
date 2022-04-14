## Configurando um projeto JavaFX 17 no Visual Studio Code

Este tutorial vale para o Visual Studio Code 1.63.0 ou qualquer versão mais recente.

Baixe o [JDK 11 ou outro mais recente](http://jdk.java.net/) no seu sistema operacional. Certifique-se de que a variável de ambiente `JAVA_HOME` está apropriadamente inicializada para o diretório de instalação do JDK. 

### Java

For the first time only:

- Baixe o [JavaFX SDK](https://gluonhq.com/products/javafx/) para o seu sistema operacional e descompacte o arquivo para o local desejado. Anote o caminho completo do local onde essa pasta foi desompactada. Vamos precisar desse caminho logo mais abaixo.

- Certifique-se de que você tem o [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) instalado no seu Visual Studio Code.

- Baixe o projeto `hellofx` que está na pasta acima, abra a pasta `hellofx` no Visual Studio Code. Abra qualquer arquivo Java do projeto a fim de importá-lo. 

- Abra o arquivo `.vscode/settings.json`, substitua o `<JavaFX_lib_path>` pelo caminho completo da pasta `lib` do JavaFX que você baixou.

- Abra o arquivo `.vscode/launch.json`, substitua o `<JavaFX_lib_path>` pelo caminho completo da pasta `lib` do JavaFX que você baixou.

#### Execute a aplicação JavaFX

Para executar a aplicação JavaFX, abra o painel `Run and Debug` no lado esquerdo -> `Launch App`.