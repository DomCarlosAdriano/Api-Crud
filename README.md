# 🏥 API Voll.med - Gerenciamento de Clínica Médica  

API **RESTful** desenvolvida em **Java** com **Spring Boot** para gerenciar o cadastro de médicos de uma clínica, com autenticação via **JSON Web Tokens (JWT)**.  

A **API Voll.med** é um projeto backend robusto que simula o sistema de uma clínica médica, fornecendo **endpoints** para o gerenciamento completo de informações de médicos.  

O projeto foi construído seguindo as melhores práticas do desenvolvimento **REST**, incluindo:  
- Uso correto de **verbos HTTP**  
- Retorno de **códigos de status adequados**  
- Padrão de **DTOs (Data Transfer Objects)** para a troca de informações  

Além disso, a API implementa um sistema de **autenticação e autorização** seguro com **Spring Security** e **JWT**, garantindo que apenas usuários autenticados possam manipular os dados.  

---

## ✨ Funcionalidades  

- **Autenticação de Usuários**  
  - Endpoint `/login` para autenticar usuários e gerar um token JWT de acesso.  

- **CRUD Completo de Médicos**  
  - **Create:** Cadastrar novos médicos.  
  - **Read:** Listar todos os médicos com paginação e detalhar um médico específico.  
  - **Update:** Atualizar informações de um médico existente.  
  - **Delete:** Excluir um médico do sistema (**exclusão lógica**).  

- **Validações**  
  - Utiliza **Bean Validation** para garantir integridade e formato correto dos dados recebidos.  

- **Segurança**  
  - Proteção dos endpoints com **Spring Security**, exigindo token JWT válido no cabeçalho `Authorization`.  

- **Paginação**  
  - A listagem de médicos é **paginada** para otimizar a performance em grandes volumes de dados.  

## 📌 Endpoints da API  

### 🔑 Autenticação  

- **POST** `/login`  
  - Realiza a autenticação do usuário.  
  - Envie **login** e **senha** no corpo da requisição.  
  - Retorna um **token JWT** de acesso.  

---

### 🩺 Médicos (`/medicos`)  

- **POST** `/medicos`  
  - 🔒 Protegido  
  - Cadastra um novo médico.  
  - Requer um **token JWT** no cabeçalho `Authorization`.  

- **GET** `/medicos`  
  - 🔒 Protegido  
  - Lista todos os médicos cadastrados.  
  - Suporta paginação:  
    ```
    /medicos?page=0&size=10
    ```  

- **PUT** `/medicos`  
  - 🔒 Protegido  
  - Atualiza as informações de um médico existente.  

- **GET** `/medicos/{id}`  
  - 🔒 Protegido  
  - Detalha as informações de um médico específico pelo seu **id**.  

- **DELETE** `/medicos/{id}`  
  - 🔒 Protegido  
  - Realiza a **exclusão lógica** de um médico pelo seu **id**.  

---

## 🖤 Feito com orgulho por **DomCarlosAdriano**  
> Minha primeira **API REST completa**! 🚀  
