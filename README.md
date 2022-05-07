 
  Nace-Project:
  
 Table Creation 
 
 CREATE TABLE IF NOT EXISTS nace (
        order INT PRIMARY KEY,
		level VARCHAR(255),
        code VARCHAR(255),
		parent VARCHAR(255),
        description VARCHAR(255),
		this_item_includes VARCHAR(2500),
        this_item_also_excludes VARCHAR(2500),
		rulings VARCHAR(255),
        this_item_excludes VARCHAR(2500),
		ref VARCHAR(255)
    );
