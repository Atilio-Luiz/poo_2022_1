## Instalando OpenJDK 17 no Ubuntu 20.04 e derivados

A seguir, mostro como instalar o Java 17 (OpenJDK 17) no sistema Linux (Ubuntu e derivados). O Java é uma linguagem de programação orientada a objetos de alto nível e uma plataforma de computação destinada a permitir que os desenvolvedores de aplicativos escrevam o programa uma vez e executem em qualquer lugar. Isso significa que um código Java compilado é executado em todas as plataformas que suportam Java sem a necessidade de recompilação. 

O JDK é uma coleção de várias ferramentas de programação, como JRE (Java Runtime Environment), Java, Javac, Jar e muitas outras. O Java 17 LTS é a versão de suporte de longo prazo mais recente para a plataforma Java SE lançada em 14 de setembro de 2021.

### 1. Atualize o sistema operacional

Atualize seu sistema operacional Ubuntu para garantir que todos os pacotes existentes estejam atualizados:

```
sudo apt update && sudo apt upgrade -y
```

O tutorial usará o comando `sudo` e supondo que você tenha o status sudo.

### 2. Instale OpenJDK 17 com APT


Vamos instalar o OpenJDK usando o repositório padrão do Ubuntu 20.04. Primeiro, pesquise para encontrar o que está disponível. No seu terminal, use o seguinte comando:

```
apt-cache search openjdk
```

Exemplo de saída:

![](fig01.png)


Como a saída acima indica, OpenJDK 17 JDE e JRE estão disponíveis para instalação.

Para iniciar a instalação dos dois, use o seguinte comando de terminal.

```
sudo apt-get install openjdk-17-jdk
```

Confirme a instalação executando o seguinte comando:

```
java --version
```

Exemplo de saída:

![](fig02.png)

As atualizações do JDK são tratadas com os comandos **update** e **upgrade** do **apt**. No entanto, você pode removê-lo separadamente ou completamente se não precisar mais do JDK.

Exemplo de comando para remoção do JDK: 

```
sudo apt-get remove openjdk-17-jdk --purge
```

**Atenção:** O comando acima removerá quaisquer dependências restantes e tentará remover o máximo possível de dados referentes à instalação.
