# Configurando o JavaFX 18 no Eclipse

## 01. Instalação do Scene Builder

A Oracle disponibiliza o código fonte do Scene Builder. Os builds para instalação são mantidos pela Gluon.

Download no link: https://gluonhq.com/products/scene-builder/

![](images/gluon.png)

Após baixar o arquivo de instalação do SceneBuilder, descompacte o arquivo e instale o software. Anote o caminho completo da pasta em que o arquivo executável foi instalado, pois esse caminho será necessário mais a frente para a configuração do JavaFX no Eclipse. Uma figura da janela do SceneBuilder é exibida abaixo.

![](images/scene.png)

No Ubuntu, para descobrir o diretório em que o SceneBuilder foi instalado, diga os seguintes passos:

1. Inicie o Scene Builder
2. Mostre o caminho para o executável rodando o seguinte comando no terminal: 
    - `ps aux | grep Scene`

![](images/terminal.png)

Como indica a primeira linha da saída na figura acima, o caminho para o executável do SceneBuilder no meu sistema é: `opt/scenebuilder/bin/SceneBuilder`



## 02. Preparação do Eclipse

- **Atenção:** Baixe e instale a versão mais recente do Eclipse. No momento da escrita deste guia, a versão mais recente é a 2022-03 (4.23.0)
 - Download: https://www.eclipse.org/downloads/


### Baixe o JavaFX SDK 18

- Baixar biblioteca do JavaFX 18 em [gluonhq](https://gluonhq.com/products/javafx/).
- Baixe o arquivo **JavaFX SDK** certo para o seu SO.
    - Na página de downloads é possível selecionar o SO (Linux, Windows), a arquitetura (x64) e o tipo (SDK), como ilustrado na imagem abaixo.

![](images/gluon02.png)

- Após baixar, descompacte em alguma pasta e **anote** o path da pasta **lib**.
- No meu caso, como eu uso Linux, o path para pasta lib ficou como:
- `/home/fox/javafx/openjfx-18_linux-x64_bin-sdk/javafx-sdk-18/lib`

![](images/pasta_lib.png)


### Instale o plug-in E(fx)clipse no Eclipse

- Com o Eclipse aberto, vá na opção Help -> Eclipse Marketplace -> na caixa de texto `Find` digite o nome do plugin *E(fx)clipse* e tecle ENTER. No momento da escrita desse guia, a versão é a 3.7.0. Instale a versão mais recente disponível. A tela da janela do Eclipse Marketplace é exibida logo abaixo.

- Vai aparecer o plugin. Clique em instalar. Ele vai iniciar a instalação do plugin. Se houver alguma licensa a ser aprovada, aprove e clique `Finish` para finalizar.

- Ele pedirá para reiniciar o Eclipe. Reinicie.

![](images/plugin01.png)

![](images/plugin02.png)


### Referencie o SceneBuilder no Eclipse

Com o Eclipse aberto, siga os seguintes passos:

- Vá para o menu e siga o seguinte caminho: *Windows -> Preferences -> JavaFX*
    - Vai aparecer a janela abaixo.

![](images/scene04.png)

- No campo **SceneBuilder executable**, entrar o caminho completo do arquivo executável do Scene Builder. 
    - **Exemplo:** no meu sistema ubuntu, o caminho ficou assim: `/opt/scenebuilder/bin/SceneBuilder`

- Depois clique nos botões **Apply** e **Apply and Close**

![](images/scene03.png)


### Crie uma User Library no Eclipse com o nome de JavaFX18

Com o Eclipse aberto, siga os seguintes passos:

- Vá para o menu e siga o caminho: *Window -> Preferences -> Java -> Build Path -> User Libraries -> New*
- Dê o nome de **JavaFX18**
- Clique em *Add External Jars* (aponte para a pasta bin do JavaFX)
- Clique em **Apply and Close**

As figuras abaixo ilustram os passos descritos acima:

![](images/tela01.png)

![](images/tela02.png)

![](images/tela03.png)

![](images/tela04.png)


---

## 03. Criando um novo projeto JavaFX no Eclipse