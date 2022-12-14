## Inleiding

Je hebt geleerd hoe je relaties, overerving en abstracte klassen moet toepassen. Ook weet je nu meer over: access modifiers, keywords, overloading, klassen, methoden en nog veel meer. In het backend landschap
worden deze concepten vaak uitgelegd aan de hand van dieren of andere levende wezens. In deze opdracht passen wij de scope, overloading, keywords en interfaces toe op Pokémons!

## Opdrachtbeschrijving

Je gaat een applicatie programmeren waarmee een speler via de commandline een spel kan spelen. Degenen die bekend zijn met Pokèmon weten
dat deze altijd een _type_ hebben (sterker nog: Pokémon kunnen meerdere types tegelijk zijn, maar om het niet te moeilijk
te maken, maken we gebruik van één type per Pokémon). Voorbeelden van deze typen zijn: Fire 🔥, Water 🌊, Grass 🌿 en
Electric ⚡. Daarnaast gaan we een gym maken en een trainer, zodat de applicatie interactief kan worden.

Naast hun type, hebben Pokémon natuurlijk bepaalde eigenschappen met elkaar gemeen. Daarom maken we gebruik van een
**super** klasse. Ook gaan we kijken naar overloading, polymorfisme en een interface.

![Pokemon!](./assets/pokemon.JPG)


### Afwijking van werkwijze

Omdat jullie inmiddels wat verder gevorderd zijn met het programmeren met `Java` gaan we jullie laten ervaren hoe het is om samen een 
applicatie in elkaar te zetten. Jullie krijgen daarom een deel van de code van ons. Deze code wordt geleverd in aparte klassen met instructies zodat jullie deze op de juiste plaats kunnen zetten in de applicatie. 
Dit betekent ook dat een groot deel van de methodes al benoemd zullen zijn. Dit is nodig om straks een werkende interactieve applicatie te hebben! 

#### Klassen naamgeving

Omdat we de belangrijkste functionaliteit al voor je hebben uitgewerkt, is het belangrijk dat je jou klassen de juiste namen geeft. Kijk daarom goed in [Methodes.java](./src/Methodes.java). 
Daar worden bijna alle klassenamen gebruikt, behalve die van de interface en de interface implementatie. De interface implementatie wordt wel in Main genoemd. De Interface wordt echter nergens vernoemd, maar dit mag je zelf proberen te achterhalen aan de hand van de implementatie naam.
Door de methodes in [Main](./src/Main.java) en [Methodes](./src/Methodes.java) goed te lezen, kun je voor de meeste methodes en variabelen al af leiden in welke klassen die moeten komen te staan.

#### Methodes en variabelen verdelen

In deze opdracht hoef je zelf geen methodes of variabelen te bedenken (tenminste, niet totdat je aan de bonusopdrachten gaat werken). 
We hebben alle methodes al voor je uitgeschreven en in [Methodes.java](./src/Methodes.java) gezet.
We hebben ook al alle variabelen die je nodig hebt beschreven in [Variabelen.java](./src/Variabelen.java). 
Het enige wat je nog moet doen is de methodes en variabelen in de juiste klasse(n) zetten. 
De variabelen moet je meestal nog een type geven en instantiëren, maar bij sommigen hebben we dat ook al gedaan.

### De aanval methodes

De aanval-methodes moeten de volgende eigenschappen hebben:
- een `system.out.println` die vertelt wie wie aanvalt met welke aanval (concatenation met variabelen, b.v.: "Bulbasaur attacks Charizard with leafStorm");
- een beslissingstructuur die kijkt welk type de vijand heeft;
- aan de hand van de beslissingstructuur moet de vijand hp punten verliezen (per type verschilt het aantal punten);
- een `system.out.println` die aangeeft wat de aanval voor effect heeft (concatenation met variabelen, b.v.: "Charizard loses 15 hp");
- vergeet de hp van de vijand niet te verlagen;
- sluit de methode af met een `system.out.println` die de resteren hp waarde weergeeft van de vijand;

De volgende methodes hebben nog een extra functie:
- `rainDance` heeft geen effect op electric Pokemons maar geeft een `system.out.println` met de boodschap: "has no effect on (vijand)";
- `rainDance` levert een hp boost aan vijanden grass-types;
- `thunder` levert een hp boost aan electric Pokemons;
- `leechSeed` trekt hp van de vijand af en geeft deze hp aan de aanvallende Pokémon terug;


### Spel logica

Bij Pokémons is het zo dat het type bepalend is voor hoe zwaar de schade is. Hieronder vind je een overzichtje voor een logica van schade bij aanvallen:
- Het type fire🔥 doet de meeste schade aan grass-pokémons🌿, daarna aan water-pokémons🌊, dan de electric-pokémons⚡ en het minste bij fire-pokémons🔥.
- Het type grass🌿 doet de meeste schade aan electric-pokémons⚡, daarna aan fire-pokémons🔥, dan de water-pokémons🌊 en het minste bij grass-pokémons🌿.
- Het type electric⚡ doet de meeste schade aan water-pokémons🌊, daarna aan grass-pokémons🌿, dan de fire-pokémons 🔥en het minste bij electric-pokémons⚡.
- Het type water🌊 doet de meeste schade aan fire-pokémons🔥, daarna aan electric-pokémons⚡, dan de grass-pokémons🌿 en het minste bij water-pokémons🌊.

## Randvoorwaarden

De applicatie moet voldoen aan het volgende:

- Een `abstract` super klasse  met 5 `private` `final`  variabelen,  1 `private`variabele, 1 constructor, 6 getters en 1 setter;
- 4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2 `private` `final` variabelen, 1 constructor, 4 methodes, 1 getter bevatten.
- Een `main`-klasse met een `main`-methode;
- Een `interface` met 11 methodes
- Een implementatie van de `interface` waarin alle methodes worden overschreven met een `@Override`
- 2 normale klassen. Waarvan een klasse met 8 variabelen, constructor, getters en setters. De andere klasse extends de eerste klasse en heeft zelf nog 1 variabele, een getter, setter en een constructor die enkel de super aanroept. 


## Stappenplan
Let op: het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken:
1. Maak de volgende klassen aan:
   - Pokemon (`abstract`)
   - FirePokemon
   - WaterPokemon
   - GrassPokemon
   - ElectricPokemon
   - PokemonGym (`interface`)
   - PokemonGymImpl
   - PokemonGymOwner
   - PokemonTrainer
2. In [Variabelen.java](./src/Variabelen.java) staan verschillende variabelen met tips. Plaats deze in de juiste klassen, die je zojuist hebt aangemaakt en geef ze de juiste datatypen.
3. Geef alle variabelen getters en setters als ze in de juiste klasse staan.
4. In [Methodes.java](./src/Methodes.java) staan de methodes die minimaal gebruikt moeten worden binnen de applicatie. Verplaats deze naar de juiste klassen.
5. Implementeer de aanval methodes zoals hierboven beschreven. Let daarbij ook op de bijzondere gevallen `raindance`, `thunder` en `leechSeed`.
6. Plaats de methodes in de interface plaatsen zonder uitwerking. Dus alleen het returntype, naam, datatypes van de parameters en de parameters van de methode.
7. Plaats gehele methodes in de implementatie van de interface. Vergeet de `@Override` niet.


## Bonusopdrachten

1. Voeg de variabele ‘food’ met het juiste datatype toe aan de juiste klasse(n). Voeg ook een methode toe waarbij de hp van de Pokémon een boost krijgt wanneer hij gevoerd wordt.
2. Pas het spel aan zodat je het pokémonvoedsel naar de Pokémon gooit voor een aanval, in plaats van een aanval doet. Als dit voedsel het juiste type is voor dit type Pokémon, zal het de Pokémon een boost geven. 
3. Op dit moment kun je het spel oneindig spelen. Pas het spel aan zodat een Pokémon die geen hp meer heeft, niet meer gebruikt kan worden, tenzij het spel opnieuw wordt opgestart.


## Tip

Let goed op welke tips en advies Intellij je geeft!
