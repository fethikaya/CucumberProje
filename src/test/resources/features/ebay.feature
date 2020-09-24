

    @ebayarama
    Feature: Amazon Birden Fazla Arama

      Scenario Outline: TC06 kullanici ebay de urun arar

        Given kullanici "http://ebay.com" sayfasina gider
         And kullanici ebay aramakutusuna "<urun>" yazar ve arar
         Then kullanici ebaysonuc sayisini ekrana yazdirir

          Examples: Urun Isimleri
            |urun  |
            |araba|
            |bebek arabasi   |
            |bisiklet     |
