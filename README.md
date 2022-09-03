
# encurtador-url

Aplicação simples utilizando web scrapping para encurtar urls a partir do site `www.encurtador.com.br`.




## Como utilizar

Para encurtar urls é simples, basta chamar UrlShortner#get passando como parametro a url a ser encutada. Caso aconteça algum problema e a url não seja encurtada, o retorno é a propria url.

## Exemplo

```
        try {
            String s = UrlShortner.get("Url-a-ser-encurtada.com");
            //Resultado encurtador.com.br/ikpM2
        } catch (IOException e) {
            e.printStackTrace();
        }
```

## Maven
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

    <dependency>
	    <groupId>com.github.PedroCavalcanti0001</groupId>
	    <artifactId>encurtador-url</artifactId>
	    <version>v1.2</version>
	</dependency>
