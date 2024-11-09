#Test Cases
    #1. Successfully Navigate Website of Datacom
    #2. Successfully Navigate to Our Locations Page
    #3. Validate if Region is present on the locations page
    #4. Validate if State is present on the locations page
    #5. Validate state name per each state
    #6. Validate address per each state
    #7. Validate contactNumber per each state
    #8. Validate email per each state

Feature: Datacom Our Locations

@testValidateLocationsPage
Scenario: Validate details on Datacom Our Locations Page
Given User navigated to datacom website
And User navigated to our locations page
Then User will validate location details in "New Zealand" using the following data
    | state        | address                                          | contactNumber  | email                                |
    | Auckland     | 58 Gaunt Street, Auckland CBD, Auckland 1010     | +64 9 303 1489 | reception.gaunt@datacom.co.nz        |
    | Christchurch | 67 Gloucester Street, Christchurch 8013          | +64 3 379 7775 | reception.christchurch@datacom.co.nz |
    | Dunedin      | Level 1, 77 Vogel Street, Dunedin 9011           | +64 3 379 7775 | reception.christchurch@datacom.co.nz |
    | Hamilton     | Level 2, 94 Bryce Street, Hamilton 3204          | +64 7 834 1666 | reception.hamilton@datacom.co.nz     |
    | Hastings     | 2/117 Heretaunga Street East, Hastings 4122      | +64 6 835 0793 | reception.hamilton@datacom.co.nz     |
    | Nelson       | Level 1, 190 Trafalgar Street, Nelson 7010       | +64 3 546 5558 | reception.nelson@datacom.co.nz       |
    | New Plymouth | Level 1, 2 Devon Street East, New Plymouth 4310  | +64 7 834 1666 | reception.hamilton@datacom.co.nz     |
    | Rotorua      | 8 Railway Road, Rotorua 3015                     | +64 7 834 1666 | reception.hamilton@datacom.co.nz     |
    | Tauranga     | 15-17 Harington Street, Tauranga 3110            | +64 7 834 1666 | reception.tauranga@datacom.co.nz     |
    | Wellington   | 55 Featherston Street, Pipitea, Wellington 6011, | +64 4 460 1500 | reception.wellington@datacom.co.nz   |
Then User will validate location details in "Australia" using the following data
    | state                   | address                                                                       | contactNumber   | email                            |
    | Adelaide                | 118 Franklin Street, Adelaide, South Australia 5000                           | +61 8 7221 7900 | contactsa@datacom.com.au         |
    | Brisbane                | 501 Ann Street, Fortitude Valley, Brisbane, Queensland 4006                   | +61 7 3842 8888 | qldsales@datacom.com.au          |
    | Canberra                | Level 12, Civic Quarter, 68 Northbourne Ave, Canberra, ACT 2601               | +61 2 6112 0200 | contactact@datacom.com.au        |
    | Melbourne               | Level 11, Two Melbourne Quarter, 697 Collins Street, Docklands, Victoria 3008 | +61 3 9626 9600 | vic-reception@datacom.com.au     |
    | Modbury                 | 100 Smart Road, Modbury, South Australia 5092                                 | +61 8 8164 7600 | reception.adel@datacom.com.au    |
    | Perth                   | Level 11, 66 St. George's Terrace, Perth, Western Australia 6000              | +61 8 6466 6888 | wa.clientservices@datacom.com.au |
    | Sydney — Denison Street | Level 31, 1 Denison Street, North Sydney, Sydney, NSW 2060                    | +61 2 9023 5000 | reception.denison@datacom.com.au |
    | Townsville              | Lot 2, 264-278 Woolcock Street, Townsville, Queensland 4810                   | +61 7 4728 7800 | townsville@datacom.com.au        |
Then User will validate location details in "Asia" using the following data
    | state       | address                                                                                       | contactNumber   | email                               |
    | Malaysia    | Level 3A, 1 Sentral, Jalan Rakyat, Kuala Lumpur Sentral, Kuala Lumpur 50470                   | +60 3 2109 1000 | info-kl@datacom.com.au              |
    | Philippines | Level 23F, IBM Plaza, 8 Eastwood Ave, Bagumbayan, Quezon City, 1110 Metro Manila, Philippines | +63 2 717 6300  | caracamille.cruz@datacom.com.au     |
    | Singapore   | 38 Beach Road, South Beach Tower, #29-11 Singapore 189767                                     | +60 3 2109 1000 | felicisimo.gadaingan@datacom.com.au |
