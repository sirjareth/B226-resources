# Activity: Polymorphism in a Battle Game

## Objective
Students will apply polymorphism by overriding both `attack()` and `defend()` methods with unique logic for different character types (Assassin, Mage, Tank).

---

## Instructions
1. Create a base class **Character** with:
   - `int health = 100` field.
   - Methods:
     - `attack(Character enemy)` → prints a generic attack message.
     - `defend(int damage)` → reduces health based on damage.

2. Create subclasses:
   - **Assassin** → `attack()` deals 30 damage. `defend()` takes full damage (fragile).
   - **Mage** → `attack()` deals 25 damage. `defend()` takes 120% of damage (very weak).
   - **Tank** → `attack()` deals 15 damage. `defend()` takes only half damage (strong defense).

3. In the `Main` class:
   - Create objects for Assassin, Mage, and Tank.
   - Simulate a battle by calling `attack()` on different enemies.
   - Print each character’s health after actions.

---

## Stretch Goal
- Modify the `defend()` method so that if a character’s health drops to `0` or below:
  - Print `"Hero has fallen!"`.
  - Prevent that character from attacking again (check health before allowing `attack()`).