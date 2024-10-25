## :camera_flash: Screenshots
<!-- You can add more screenshots here if you like -->
<img src="/img_1.png" width="260">&emsp;<img src="/img_2.png" width="260">

## Gmidi
Aplicativo Android de WebView para o site GMidi

## Descrição
Este projeto é um aplicativo Android que foi desenvolvido pra suprir uma demanda do cliente de forma rapida e eficaz para se ter um aplicativo,a solução encontrada foi desenvolver um app que utiliza uma WebView para carregar o site GMidi. O aplicativo inclui uma implementação personalizada de `WebViewClient` para gerenciar o carregamento de URLs e abre links externos no navegador padrão do dispositivo. Além disso, o aplicativo apresenta uma tela de erro amigável caso não consiga conectar-se à internet.

## Funcionalidades
- Carrega o site GMidi dentro do aplicativo utilizando WebView.
- Abre links externos no navegador padrão do dispositivo.
- Exibe uma tela de erro amigável quando não há conexão com a internet.
- Permite ao usuário tentar recarregar a página após uma falha de conexão.

## Pré-requisitos
- Android Studio instalado (versão 4.0 ou superior).
- Dispositivo ou emulador Android com API nível 21 (Lollipop) ou superior.
- Conexão com a internet para carregar o conteúdo web.

## Instalação
Clone o repositório:

git clone https://github.com/seu-usuario/seu-projeto.git

## Abra o projeto no Android Studio:
- Selecione **File > Open...** e navegue até a pasta do projeto clonado.

## Sincronize o projeto:
- O Android Studio irá sincronizar o projeto e baixar todas as dependências necessárias.

## Execute o aplicativo:
- Conecte um dispositivo Android ou inicie um emulador.
- Clique em **Run > Run 'app'** ou pressione **Shift + F10**.

## Uso
**Carregamento do Site:**
- Ao abrir o aplicativo, o site GMidi será carregado dentro da WebView integrada.

**Navegação Externa:**
- Se o usuário clicar em um link que não pertence ao domínio `https://gmidi.netlify.app/`, o link será aberto no navegador padrão do dispositivo.

**Tratamento de Erro de Conexão:**
- Caso não haja conexão com a internet, uma tela de erro amigável será exibida, permitindo que o usuário tente recarregar a página.
