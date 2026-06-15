from anthropic import Anthropic
import os

client = Anthropic(
    api_key=os.environ["ANTHROPIC_API_KEY"]
)

response = client.messages.create(
    model="claude-sonnet-4-6",
    max_tokens=200,
    messages=[
        {
            "role": "user",
            "content": "Explain dependency injection in Spring Boot"
        }
    ]
)

print(response.content[0].text)