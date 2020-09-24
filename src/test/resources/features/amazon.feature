

@urununarama @amazon #çalıştırıken bu takı yazarsak tüm senaryoları yazdırır

  Feature: Amazon Arama

    Background:
      Given kullanici amazon sayfasina gider
      #BeforClass gibi her method çalışmadan önce çalışır. Ortak olan adım buraya yazlır

    @amazon
    Scenario: TC02_kullanici amazonda arama yapar
      #Given kullanici amazon sayfasina gider (Yukarida backgraund metodunda yazarak iki senaryoda da çalışır)
      And kullanici aramakutusuna headphones yazar ve arar
      Then kullanici sonuc sayisini ekrana yazdirir

    @amazoncamera
    Scenario:  TC03_kullanici amazonda arama yapar
      #Given kullanici amazon sayfasina gider (Yukarida backgraund metodunda yazarak iki senaryoda da çalışır)
      And kullanici aramakutusuna camera yazar ve arar
      Then kullanici sonuc sayisini ekrana yazdirir
