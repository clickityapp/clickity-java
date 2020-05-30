# Mailosaur Java Client Library

[Mailosaur](https://mailosaur.com) allows you to automate tests involving email. Allowing you to perform end-to-end automated and functional email testing.

[![](https://github.com/mailosaur/mailosaur-java/workflows/CI/badge.svg)](https://github.com/mailosaur/mailosaur-java/actions)

## Installation

### Maven users

Add this dependency to your project's POM:

```
<dependency>
  <groupId>com.mailosaur</groupId>
  <artifactId>mailosaur-java</artifactId>
  <version>6.0.0</version>
</dependency>
```

### Others

You'll need to manually install the following JARs:

* The Mailosaur JAR from https://github.com/mailosaur/mailosaur-java/releases/latest

## Documentation and usage examples

[Mailosaur's documentation](https://mailosaur.com/docs) includes all the information and usage examples you'll need.

## Running tests

Once you've cloned this repository locally, you can simply run:

```
export MAILOSAUR_API_KEY=your_api_key
export MAILOSAUR_SERVER=server_id

mvn test
```

## Contacting us

You can get us at [support@mailosaur.com](mailto:support@mailosaur.com)
