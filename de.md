## Task 1 - Behavioural

### Strategy Pattern - Item Searching
In the previous milestone, Fred had left some really nasty searching and sorting code. The searching has been brought out into the code which you can work on, which is not well written. With the starting point, search criteria is stored as a String which is a flawed system for specifying specific types. You should look around for all relevant bits of code for item searching, but a dev has expressed dissatisfaction about the `searchItems(String)` method in the `Inventory.java` file.

Additionally, creating the <s>sorting</s> searching buttons/options in the GUI has already been provided for you inside of the `SetupSearching(InventoryPage)` method of `App.java`. These importantly call the Inventory Pages `addSearchByButton` method where the name of the option and the action to perform is provided as a lambda function. You will need slightly modify these to facilitate the implementation of the strategy pattern.

Size guide: 40 to 80 lines of code.


## Task 2 - Structural
LART Studios has noticed the booming popularity of a particular mining and crafitng game, and wishes to cash in on this idea. To do so, items are broken into two categories, base items and craftable items.  

* Base items exist on their own and have their own weight.  
* Craftable items are made up of other craftable items and/or base items, and have the weight be the sum of all items which make up the craftable item.

Your task is to use the `composite pattern` to facilitate crafting and uncrafting/pulling apart of craftable items. When an item is crafted, the items should be sourced from the players inventory. When an item is pulled apart/uncrafted, the items should be returned to the players inventory.

Within the Item page and crafting page of the GUI, you will find `Craft` and `Uncraft` buttons. The action that these buttons perform is defined in the `setupCrafting(ItemCraftPage)` and `setupUncrafting(ProductPage)` methods of `App.java`.In the provided starting point, these only print something to the console. Once your have implemented craft/uncrafting, you should change these to invoke what ever methods perform those actions.

Size guide: 40 to 80 lines of code.

## Task 3 
### Observer Pattern - Storage Updates
In the future the inventory system might be put to work in a multi-player game. In this scenario, multiple players may have access to the same Storage box where the Observer (aka Pub-Sub) might prove useful. For this to work smoothly, each player should have their own copy of Storage to work with. Whenever an update happens to the storage (such as storing or retreiving a new item), all players be updated about the new stock of the Inventory.

In the provided starting code, the player is given a reference to the instance of storage in the constructor of `App.java`. Apply the observer pattern such that the player is a subscriber/observer of the storage. 

Size guide: 20 to 50 lines of code
