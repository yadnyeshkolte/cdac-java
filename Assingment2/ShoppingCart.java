
class ShoppingCart {
    //CertIteam[] temp;
    CartItem[] intializeObjects() {
        CartItem[] item = new CartItem[20];
        item[0] = new CartItem(1, "Dell Laptop", 60000, 2);
        item[1] = new CartItem(2, "HP Pavilion 15", 55000, 1);
        item[2] = new CartItem(3, "Lenovo ThinkPad E14", 62000, 3);
        item[3] = new CartItem(4, "Acer Aspire 7", 50000, 2);
        item[4] = new CartItem(5, "Asus Vivobook 16", 58000, 1);
        item[5] = new CartItem(6, "Apple MacBook Air M1", 92000, 1);
        item[6] = new CartItem(7, "Apple MacBook Pro M2", 135000, 1);
        item[7] = new CartItem(8, "MSI Gaming GF63", 70000, 2);
        item[8] = new CartItem(9, "Razer Blade 15", 160000, 1);
        item[9] = new CartItem(10, "Samsung Galaxy Book3", 85000, 2);
        item[10] = new CartItem(11, "Microsoft Surface Laptop 5", 125000, 1);
        item[11] = new CartItem(12, "LG Gram 17", 105000, 1);
        item[12] = new CartItem(13, "Dell XPS 13", 115000, 1);
        item[13] = new CartItem(14, "Asus ROG Zephyrus G14", 145000, 1);
        item[14] = new CartItem(15, "HP Omen 16", 95000, 2);
        item[15] = new CartItem(16, "Lenovo Legion 5 Pro", 120000, 1);
        item[16] = new CartItem(17, "Acer Predator Helios 300", 110000, 1);
        item[17] = new CartItem(18, "Gigabyte AERO 15", 140000, 1);
        item[18] = new CartItem(19, "Huawei MateBook D15", 65000, 2);
        item[19] = new CartItem(20, "Realme Book Slim", 45000, 3);

        return item;
    }
}