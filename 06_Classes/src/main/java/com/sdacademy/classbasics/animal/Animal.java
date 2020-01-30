package com.sdacademy.classbasics.animal;

public class Animal {

    //Definicje pól, jeśli poza polami są jakieś stałe, to zazwyczaj definiujemy je nad polami
    private String kind;
    private String name;
    private int age;

    //Konstruktor, który inicjalizuje pola przy tworzeniu obiektu.
    //Może być jeden, lub może być ich wiele.
    //Jeśli sami nie zdefiniukemy żadnego konstruktora, Java dostarczy jeden konstruktor bezargumentowy.
    public Animal(String kind, String name, int age) {
        this.kind = kind;
        this.name = name;
        this.age = age;
    }

    // bardzo często klasy posiadają gettery (inna nazwa: akcesory)
    // oraz settery (inna nazwa: mutuatory) - czyli metody służące kolejno
    // do pobierania wartości/referencji pola oraz jego aktualizacji.
    // Nasze klasy powinny być pisane zgodnie z regułą hermetyzacji.
    // Nie udostępniamy naszych pół bezpośrednio (poprzez tworzenie pól publicznych),
    // ale kontrolujemy do nich dostęp właśnie przez
    // gettery i settery, w których można zawrzeć dodatkowy kod walidujący)
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //publiczna metoda naszej klasy, z której na obiektach naszej klasymogą korzystać inne klasy
    public boolean isDangerous() {
        if (kind.equals("Lion") || kind.equals("Shark") || kind.equals("Crocodile")) {
            return true;
        } else {
            return false;
        }
    }

    //Metoda toString, która zwraca tekstową reprezentację obiektu,
    //Można wtedy np: używać println na naszych obiektach
    @Override
    public String toString() {
        return "animal{" +
                "kind='" + kind + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
