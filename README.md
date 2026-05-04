
# Projeto CP1/AP1

Este projeto consiste em uma API REST desenvolvida com **Spring Boot**.  A aplicação utiliza persistência em banco de dados MySQL via Docker e documentação interativa com Swagger.


## 🐳 1. Docker e Infraestrutura (Banco de Dados)

Para rodar a aplicação, é necessário configurar o banco de dados MySQL utilizando o Docker para garantir que o ambiente seja idêntico em qualquer máquina.

### 5 - Docker (Preparação)
1. Abra o **Menu Iniciar** e pesquise por **Docker Desktop**.
2. Clique para iniciar o serviço (**Start Docker Service**).
3. Certifique-se de que o Docker Desktop está devidamente carregado e ativo antes de prosseguir.

### 6 - Subir MySQL
Abra o terminal (PowerShell, CMD ou terminal do VS Code) e execute o comando abaixo para criar o container do banco de dados:

```bash
docker run -d \
    --name mysql \
    --rm \
    -e MYSQL_ROOT_PASSWORD=root_pwd \
    -e MYSQL_USER=new_user \
    -e MYSQL_PASSWORD=my_pwd \
    -p 3306:3306 \
    mysql
```

---

## 🚀 2. Instruções de Uso

### Porta da Aplicação
A aplicação está configurada para rodar na porta padrão:
`server.port=8080`

### Para executar a aplicação:
Certifique-se de estar na pasta raiz do projeto (onde reside o arquivo `pom.xml`) e execute o seguinte comando no terminal:
```bash
mvn spring-boot:run
```

---

## 📑 3. Documentação Swagger

A documentação da API foi configurada para ser acessada diretamente na raiz do projeto, facilitando a visualização e o teste dos endpoints sem a necessidade de ferramentas externas como Postman ou Insomnia.

**Caminho da documentação Swagger:**
`springdoc.swagger-ui.path=/`

Para acessar a interface e testar os métodos (GET, POST, PUT, DELETE), utilize o link:
🔗 [http://localhost:8080/](http://localhost:8080/)
