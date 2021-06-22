Padroes de Projeto

1) Criacionais
2) Estruturais
3) Comportamentais

* Criacionais

5.Singleton
-> O Singleton é um padrão de projeto criacional, que garante que apenas um objeto desse tipo exista e forneça um único ponto de acesso a ele para qualquer outro código.


-> Aplicabilidade
Utilize o padrão Singleton quando uma classe em seu programa deve ter apenas uma instância disponível para todos seus clientes; por exemplo, um objeto de base de dados único compartilhado por diferentes partes do programa.
Utilize o padrão Singleton quando você precisa de um controle mais estrito sobre as variáveis globais.

->Identificação: O Singleton pode ser reconhecido por um método de criação estático, que retorna o mesmo objeto em cache.


Exempos de utilizacao:

java.lang.Runtime#getRuntime()