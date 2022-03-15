## Instalando OpenJDK 17 no Ubuntu 20.04 e derivados

Nesse guia, vous mostrar como instalar o Java 17 (OpenJDK 17) no sistema Linux Ubuntu. O Java é uma linguagem de programação orientada a objetos de alto nível e uma plataforma de computação destinada a permitir que os desenvolvedores de aplicativos escrevam o programa uma vez e executem em qualquer lugar. Isso significa que um código Java compilado é executado em todas as plataformas que suportam Java sem a necessidade de recompilação. 

O JDK é uma coleção de várias ferramentas de programação, como JRE (Java Runtime Environment), Java, Javac, Jar e muitas outras. O Java 17 LTS é a versão de suporte de longo prazo mais recente para a plataforma Java SE lançada em 14 de setembro de 2021.

### 1. Atualize o sistema operacional

Atualize seu sistema operacional Ubuntu para garantir que todos os pacotes existentes estejam atualizados:

```
sudo apt update && sudo apt upgrade -y
```

O tutorial usará o comando `sudo` e supondo que você tenha o status sudo.

