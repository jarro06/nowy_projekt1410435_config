 
listView('nowy_projekt1410435 Jobs') {
    description('nowy_projekt1410435 Jobs')
    jobs {
        regex('nowy_projekt1410435_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
