 
listView('QWQWQWQW2 Jobs') {
    description('QWQWQWQW2 Jobs')
    jobs {
        regex('QWQWQWQW2_.+')
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
