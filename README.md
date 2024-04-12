````markdown
# Controle de Conta Bancária Virtual

Este é um projeto simples para controlar uma conta bancária virtual em Java. Ele oferece funcionalidades básicas, como consulta de saldo, recebimento e transferência de valores.

## Funcionalidades

1. **Consulta de Saldos**: Permite visualizar o saldo atual da conta.
2. **Receber Valor**: Permite receber um valor na conta.
3. **Transferir Valor**: Permite transferir um valor para outra conta.
4. **Sair**: Encerra a aplicação.

## Instruções de Uso

Ao iniciar a aplicação, você será apresentado com os dados iniciais do cliente e um menu de operações. Basta digitar o número correspondente à operação desejada.

### Exemplo de Uso

Ao escolher a opção "Consultar saldos", será exibido o saldo atual da conta:

```
Saldo atualizado: R$ 2500.00
```

Ao escolher a opção "Receber valor", será solicitado que você informe o valor a receber. Após inserir o valor, o saldo será atualizado e exibido:

```
Informe o valor a receber:
700

Saldo atualizado: R$ 3200.00
```

Ao escolher a opção "Transferir valor", será solicitado que você informe o valor a transferir. Se houver saldo suficiente na conta, a transferência será efetuada e o novo saldo será exibido:

```
Informe o valor que deseja transferir:
1000

Saldo atualizado: R$ 2200.00
```

Se tentar transferir um valor maior do que o saldo disponível, você receberá a seguinte mensagem:

```
Não há saldo suficiente para fazer essa transferência.
```

Por fim, ao escolher a opção "Sair", a aplicação será encerrada.

## Como Executar

Para executar o programa, basta compilar e executar o arquivo `Main.java`.

```bash
javac Main.java
java Main
```

## Desenvolvimento

Este projeto é parte do desafio do curso **Java Alura - Oracle ONE - Ifood 6**. Ele é uma oportunidade para praticar conceitos aprendidos no curso, como declaração de variáveis, estruturas condicionais e loops.

## Autor

Este projeto foi desenvolvido por Marcos Tullio.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou reportar problemas.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
```
