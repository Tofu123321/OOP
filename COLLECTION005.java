    import java.util.*;

    class Pokemon
    {
        String name;
        String element;
        int health;

        public Pokemon(String name, String element, int health)
        {
            this.name = name;
            this.element = element;
            this.health = health;
        }


    }

    class Trainer
    {
        String name;
        int numberOfBadges;
        List<Pokemon> pokemons;

        public Trainer(String name)
        {
            this.name = name;
            this.numberOfBadges = 0;
            this.pokemons = new ArrayList<> ();
        }

        // add pokemon
        public void addPokemon(Pokemon pokemon)
        {
            pokemons.add(pokemon);
        }

        // has element
        public boolean hasElement(String element)
        {
            for(Pokemon pokemon : pokemons)
            {
                if(pokemon.element.equals(element))
                {
                    return true;
                }
            }
            return false;
        }

        // decrease health
        public void decreaseHealth()
        {
            pokemons.removeIf(pokemon -> {
                pokemon.health -= 10;
                return pokemon.health <= 0;
            });
        }

    }


    public class COLLECTION005 
    {    
    public static void main(String[] args)
    {
            Scanner scanner = new Scanner(System.in);
            Map<String, Trainer> trainers = new LinkedHashMap<> ();
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                if(line.equals("Tournament"))
                {
                    break;
                }
                String[] parts = line.split(" ");
                String name = parts[0];
                String pokename = parts[1];
                String pokeElement = parts[2];
                int pokeHealth = Integer.parseInt(parts[3]);

                trainers.putIfAbsent(name, new Trainer(name));
                trainers.get(name).addPokemon(new Pokemon(pokename, pokeElement, pokeHealth ));
            }

            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                if(line.equals("End"))
                {
                    break;
                }

                for (Trainer trainer : trainers.values())
                {
                    if(trainer.hasElement(line))
                    {
                        trainer.numberOfBadges++;
                    }
                    else
                    {
                        trainer.decreaseHealth();
                    }
                }
                
            }
            scanner.close();
            trainers.values().stream()
                    .sorted((t1, t2) -> Integer.compare(t2.numberOfBadges, t1.numberOfBadges))
                    .forEach(t -> System.out.println(t.name + " " + t.numberOfBadges + " " + t.pokemons.size()));
    }

    }
