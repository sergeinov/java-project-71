### Hexlet tests and linter status:
[![Actions Status](https://github.com/sergeinov/java-project-71/workflows/hexlet-check/badge.svg)](https://github.com/sergeinov/java-project-71/actions) <br>
[![Maintainability](https://api.codeclimate.com/v1/badges/8bda04939d49c6823e8f/maintainability)](https://codeclimate.com/github/sergeinov/java-project-71/maintainability) <br>
[![Test Coverage](https://api.codeclimate.com/v1/badges/8bda04939d49c6823e8f/test_coverage)](https://codeclimate.com/github/sergeinov/java-project-71/test_coverage) <br>
[![Github Actions](https://github.com/sergeinov/java-project-71/actions/workflows/my_workflow.yml/badge.svg)](https://github.com/sergeinov/java-project-71actions/workflows/my_workflow.yml) <br>
---
### Описание
Вычислитель отличий – программа, определяющая разницу между двумя структурами данных.  
Это популярная задача, для решения которой существует множество онлайн-сервисов, например: http://www.jsondiff.com/.  
Подобный механизм используется при выводе тестов или при автоматическом отслеживании изменении в конфигурационных файлах.

### Возможности программы:
#### Справка

    ./build/install/app/bin/app -h

#### Сравнение файлов JSON:

    ./build/install/app/bin/app filepath1.json filepath2.json

#### Сравнение файлов yaml:

    ./build/install/app/bin/app filepath1.yaml filepath2.yaml

#### Форматы отчета

По умолчанию вывод результата сравнения производится в формате stylish.

Вывод результата сравнения в формате plain:

    ./build/install/app/bin/app -f plain file1.json file2.json

Вывод результата сравнения в формате json:

    ./build/install/app/bin/app -f json file1.json file2.json

### Пример работы
https://asciinema.org/a/2phZLop8dWyWJ80o4O0aDzJ3q

### Setup
```sh
make build
```

### Run
```sh
make run
```

### Run checkstyle
```sh
make lint
```

### Run test
```sh
make test
```

### Run jacoco report
```sh
make report
```

### Update dependencies and plugins
```sh
make update-deps
```

### Clean build
```sh
make clean
```

---