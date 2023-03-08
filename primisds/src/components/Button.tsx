import { ReactNode } from 'react';
import { Slot } from '@radix-ui/react-slot';
import { clsx } from 'clsx';

export interface ButtonProps {
    children: ReactNode;
    asChild?: boolean;
}

export function Button({ children, asChild }: ButtonProps) {
    const Comp = asChild ? Slot : 'button';

    return (
        <Comp
            className={clsx(
                'py-4, px-3, bg-gray-500 rounded, w-full font-semibold, w-80, ring-1 ring-brown-200'
            )}
        >
            <span className={clsx(
                'text-gray-400 text-sm text-left, w-full'
            )}>
            {children}
            </span>
        </Comp>
    )
}

