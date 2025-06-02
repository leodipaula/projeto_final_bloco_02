
# Projeto Final Bloco 02 - CRUD Farmácia

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

Repositório do projeto CRUD (Create, Read, Update, Delete) para uma loja de farmácias desenvolvido durante o curso da Generation Brasil.

## 📋 Descrição

Projeto Java que implementa um sistema básico de gerenciamento de farmácia com operações CRUD, desenvolvido como trabalho final do segundo bloco do curso Generation.

## ✨ Funcionalidades

- Cadastro de produtos farmacêuticos
- Listagem completa de produtos
- Atualização de registros
- Remoção de itens do estoque
- Consultas específicas por ID ou categoria

## 🛠 Tecnologias

- Java 11+
- MySQL (ou seu SGBD preferido)
- Maven (gerenciamento de dependências)

## 🔧 Instalação

1. Clone o repositório:
```bash
git clone https://github.com/leodipaula/projeto_final_bloco_02.git
```

2. Importe o projeto em sua IDE favorita como projeto Maven

3. Configure o arquivo `src/main/resources/application.properties` com suas credenciais de banco de dados

4. Execute o projeto

## 📌 Estrutura do Projeto

```
projeto_final_bloco_02/
├── src/
│   ├── main/java/br/com/generation/projetofarmacia/
│   │   ├── controller/    # Controladores REST
│   │   ├── model/         # Entidades JPA
│   │   ├── repository/    # Interfaces de repositório
│   │   └── service/       # Lógica de negócio
│   └── resources/         # Arquivos de configuração
└── pom.xml                # Dependências Maven
```

## 🤝 Contribuição

Contribuições são bem-vindas! Siga estes passos:

1. Faça um fork do projeto
2. Crie sua branch (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

---

Desenvolvido com ❤️ por [Leonardo Di Paula](https://github.com/leodipaula) durante o curso da Generation Brasil.

