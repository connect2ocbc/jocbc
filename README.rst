
==========
jocbc
==========


==========
Installing
==========

You can get the source code from here

.. code:: shell

    $ git clone https://github.com/connect2ocbc/jocbc.git && cd pyocbc

==========
How to run
==========

.. code:: shell

    Forex forex = new Forex("https://api.ocbc.com:8243/Forex/1.0", "<TOKEN>");
    ArrayList<Rate> rates = forex.all();
    for (Rate rate: rates) {
        System.out.println(rate);
    }

    Branches branches = new Branches("https://api.ocbc.com:8243/branch_locator/1.0", "<TOKEN>");
    ArrayList<Branch> branchlist = branches.all();
    for (Branch branch: branchlist) {
        System.out.println(branch);
    }

    Atms atms = new Atms("https://api.ocbc.com:8243/atm_locator/1.0", "<TOKEN>");
    ArrayList<Atm> atmlist = atms.all();
    for (Atm atm: atmlist) {
        System.out.println(atm);
    }

    CCSuggest cc = new CCSuggest("https://api.ocbc.com:8243/CC/1.0", "<TOKEN>");
    ArrayList<CreditCard> cclist = cc.suggest("Dining");
    for (CreditCard creditCard: cclist) {
        System.out.println(creditCard);
    }